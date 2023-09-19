package com.blossom.backend.server.todo.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 新增阶段性事项的名称
 */
@Data
public class TodoPhasedAddReq {
    /**
     * 阶段性事项名称
     */
    @NotBlank(message = "阶段性事项名称为必填项")
    private String todoName;
}
