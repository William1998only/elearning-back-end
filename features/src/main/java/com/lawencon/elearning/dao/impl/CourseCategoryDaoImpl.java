package com.lawencon.elearning.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.lawencon.elearning.dao.CourseCategoryDao;
import com.lawencon.elearning.dao.CustomBaseDao;
import com.lawencon.elearning.model.CourseCategory;

/**
 * @author : Galih Dika Permana
 */
@Repository
public class CourseCategoryDaoImpl extends CustomBaseDao<CourseCategory>
    implements CourseCategoryDao {

  @Override
  public List<CourseCategory> getListCourseCategory() throws Exception {
    return getAll();
  }

  @Override
  public void insertCourseCategory(CourseCategory courseCategory) throws Exception {
    save(courseCategory, null, null, true, true);
  }

  @Override
  public void updateCourseCategory(CourseCategory courseCategory) throws Exception {
    save(courseCategory, null, null, true, true);
  }

  @Override
  public void deleteCourseCategory(String id) throws Exception {
    deleteById(id);
  }

  @Override
  public void softDelete(String id) throws Exception {
    String sql =
        buildQueryOf("UPDATE tb_m_course_categories SET is_active = FALSE WHERE id =?1 ")
            .toString();
    createNativeQuery(sql).setParameter(1, id).executeUpdate();

  }



}
