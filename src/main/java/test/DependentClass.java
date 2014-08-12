package test;

import org.springframework.jdbc.core.JdbcTemplate;

public class DependentClass {
  public Object method() throws Exception {
    JdbcTemplate template = new JdbcTemplate();
	return template.queryForList("SELECT 1 FROM DUAL");
  }
}
