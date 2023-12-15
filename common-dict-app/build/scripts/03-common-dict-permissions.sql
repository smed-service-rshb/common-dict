SELECT common_dict.setup_permission_rights('addresses-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES', 'EXECUTE_CREATE_CLIENT', 'EXECUTE_EDIT_CLIENT']);
SELECT common_dict.setup_permission_rights('get-address', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES', 'EXECUTE_CREATE_CLIENT', 'EXECUTE_EDIT_CLIENT']);
SELECT common_dict.setup_permission_rights('addresses-replication', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('external-systems-list', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('create-external-system', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-external-system', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('edit-external-system', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('delete-external-system', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('external-systems-errors-list', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('create-external-system-error', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-external-system-error', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('edit-external-system-error', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('delete-external-system-error', ARRAY ['EDIT_SYSTEM_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('offices-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-office', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('branches-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-branch', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('division-codes-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-division-code', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('create-division-code', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-division-by-code', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('banks-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES', 'EXECUTE_EXTERNAL_ACCOUNTS_TRANSFER_PROCESS']);
SELECT common_dict.setup_permission_rights('create-bank', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-bank', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('edit-bank', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('delete-bank', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('banks-replication', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('channels-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-channel', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);

SELECT common_dict.setup_permission_rights('print-templates-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('print-templates-get', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('print-templates-edit', ARRAY ['EDIT_BUSINESS_DICTIONARIES']);
