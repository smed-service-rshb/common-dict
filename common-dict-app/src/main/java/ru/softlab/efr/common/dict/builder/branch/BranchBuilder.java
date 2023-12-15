package ru.softlab.efr.common.dict.builder.branch;

import ru.softlab.efr.common.dict.exchange.model.Branch;
import ru.softlab.efr.common.dict.model.BranchEntity;

/**
 * Класс для построения данных о отделении
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
public class BranchBuilder {

    /**
     * Построение данных об отделении
     *
     * @param branchEntity сущность BranchEntity
     * @return данные об отделении
     */
    public static Branch buildBranch(BranchEntity branchEntity) {
        Branch branch = new Branch();
        branch.setId(branchEntity.getId());
        branch.setCode(branchEntity.getCode());
        branch.setSimpleName(branchEntity.getSimpleName());
        branch.setOfficialName(branchEntity.getOfficialName());
        return branch;
    }
}
