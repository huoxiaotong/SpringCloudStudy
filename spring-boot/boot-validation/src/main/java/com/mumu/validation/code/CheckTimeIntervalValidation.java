package com.mumu.validation.code;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;
import java.util.Objects;

public class CheckTimeIntervalValidation implements ConstraintValidator<CheckTimeValidation, Object> {
    private String startTime;

    private String endTime;

    @Override
    public void initialize(CheckTimeValidation constraintAnnotation) {
        this.startTime = constraintAnnotation.startTime();
        this.endTime = constraintAnnotation.endTime();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.isNull(value)) return true;

        BeanWrapper beanWrapper = new BeanWrapperImpl(value);
        Object start = beanWrapper.getPropertyDescriptor(startTime);
        Object end = beanWrapper.getPropertyDescriptor(endTime);

        if (Objects.isNull(start)) return true;
        if (Objects.isNull(end)) return true;

        int result = ((Date) end).compareTo((Date) start);

        if (result > 0) {
            return true;
        }
        return false;
    }
}
