package com.lawencon.elearning.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.lawencon.elearning.dao.CourseTypeDao;
import com.lawencon.elearning.dao.CustomBaseDao;
import com.lawencon.elearning.model.CourseType;
import com.lawencon.util.Callback;

/**
 * @author : Galih Dika Permana
 */
@Repository
public class CourseTypeDaoImpl extends CustomBaseDao<CourseType> implements CourseTypeDao {

  @Override
  public List<CourseType> getListCourseType() throws Exception {
    return getAll();
  }

  @Override
  public void insertCourseType(CourseType courseType, Callback before) throws Exception {
    save(courseType, before, null, true, true);
  }

  @Override
  public void updateCourseType(CourseType courseType, Callback before) throws Exception {
    save(courseType, before, null, true, true);
  }

  @Override
  public void deleteCourseType(String id) throws Exception {
    deleteById(id);
  }

  @Override
  public void updateIsActived(String id) throws Exception {
    String sql =
        buildQueryOf("UPDATE tb_m_course_types SET is_active = FALSE WHERE id =?1 ").toString();
    createNativeQuery(sql).setParameter(1, id).executeUpdate();

  }



}
