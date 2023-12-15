package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.softlab.efr.common.dict.builder.branch.BranchBuilder;
import ru.softlab.efr.common.dict.exchange.model.Branch;
import ru.softlab.efr.common.dict.model.BranchEntity;
import ru.softlab.efr.common.dict.services.BranchService;
import ru.softlab.efr.common.permissions.BranchesPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityNotFoundException;

/**
 * Контроллер подразделений
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@RestController
@RequestMapping("/dictionaries/branches")
public class BranchController implements BranchesApi {

    private final BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    /**
     * Возвращает список подразделений
     *
     * @param pageable количество страниц
     * @return список подразделений
     */
    @RequestMapping(method = RequestMethod.GET)
    @HasPermission(BranchesPermissions.BRANCHES_LIST)
    public ResponseEntity<Page<Branch>> listBranches(@PageableDefault(value = 50) Pageable pageable) {
        Page<BranchEntity> branchEntities = branchService.findAll(pageable);
        return ResponseEntity.ok(branchEntities.map(BranchBuilder::buildBranch));
    }

    /**
     * Возвращает подразделение по идентификатору
     *
     * @param id идентификатор подразделения
     * @return подразделение
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HasPermission(BranchesPermissions.GET_BRANCH)
    public ResponseEntity<Branch> getBranch(@PathVariable("id") Long id) {
        BranchEntity branchEntity;
        try {
            branchEntity = branchService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(BranchBuilder.buildBranch(branchEntity));
    }

    /**
     * Возвращает подразделение по коду
     *
     * @param code код подразделения
     * @return подразделение
     */
    @RequestMapping(method = RequestMethod.GET, params = "code")
    @HasPermission(BranchesPermissions.GET_BRANCH)
    public ResponseEntity<Branch> getBranchByCode(@RequestParam("code") String code) {
        BranchEntity branchEntity;
        try {
            branchEntity = branchService.findByCode(code);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(BranchBuilder.buildBranch(branchEntity));
    }
}
