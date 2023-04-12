package racingcar.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDao {

    private final JdbcTemplate jdbcTemplate;

    public PlayerDao(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(final String name) {
        String sql = "insert into player (name) values (?)";

        jdbcTemplate.update(sql, name);
    }

    public boolean isNotExist(final String name) {
        String sql = "select count(*) from player where name = ?";

        return Boolean.FALSE.equals(jdbcTemplate.queryForObject(sql, Boolean.class, name));
    }
}
