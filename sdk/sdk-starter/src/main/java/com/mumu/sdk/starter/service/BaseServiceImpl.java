package com.mumu.sdk.starter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mumu.sdk.api.exception.SdkException;
import com.mumu.sdk.api.model.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class BaseServiceImpl {

    protected @Autowired ObjectMapper mapper;

    protected void requeireNonNull(String names[],Object... objs) {
        for (Object obj : objs) {
            if (Objects.isNull(obj)) {
                throw new SdkException(obj + "不能为空");
            }
        }
    }

    protected <P extends Product> Optional<P> invokeFeign(Supplier<ResponseEntity<?>> supplier, Class<P> clazz) {
        ResponseEntity<?> responseEntity = supplier.get();
        Object obj = responseEntity.getBody();
        return Optional.ofNullable(obj).map(node ->{
            return this.readVale((ObjectNode) node,clazz);
        });
    }

    @SneakyThrows
    private <P extends Product> P readVale(ObjectNode node, Class<P> clazz) {
        return this.mapper.readValue(node.traverse(), clazz);
    }
}
