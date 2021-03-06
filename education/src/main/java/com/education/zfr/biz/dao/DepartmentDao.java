package com.education.zfr.biz.dao;

import com.education.zfr.biz.entity.CpnDepartment;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by zangfr on 2017/5/5.
 */
public interface DepartmentDao extends PagingAndSortingRepository<CpnDepartment,Long>,JpaSpecificationExecutor<CpnDepartment> {
    CpnDepartment findByDepartmentId(Long departmentId);

    CpnDepartment findByDepartmentName(String departmentName);

    List<CpnDepartment> findByParentId(Long parentId);
}
