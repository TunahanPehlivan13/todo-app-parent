package com.todo.entity;

import com.todo.entity.enums.Priority;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TodoBuilderTest {

    @Test
    public void shouldBuildTodo() {
        Todo todo = new Todo.Builder()
                .note("note")
                .priority(Priority.HIGH)
                .userId("userId")
                .build();

        assertNotNull(todo.getId());
        assertEquals(todo.getNote(), "note");
        assertThat(todo.getPriority(), equalTo(Priority.HIGH));
        assertEquals(todo.getUserId(), "userId");
    }
}