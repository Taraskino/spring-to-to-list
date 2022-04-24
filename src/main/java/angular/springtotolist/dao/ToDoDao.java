package angular.springtotolist.dao;

import angular.springtotolist.model.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoDao extends JpaRepository<Todo, Integer> {
        int countAllByStatus(String status);
        List<Todo>findByStatus(String status);
        List<Todo>findTop3ByStatusInOrderByDueDate(List<String>  status);
        List<Todo>findAllByOrderByDueDateAsc();
        List<Todo>findAllByOrderByDueDateDesc();

        Page<Todo> findAllBy(Pageable pageable);
}
