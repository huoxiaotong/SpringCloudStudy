package com.mumu.validation.code;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.*;

@Documented
@Constraint(
        validatedBy = CheckTimeIntervalValidation.class
)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(CheckTimeValidation.List.class)
public @interface CheckTimeValidation {

    String startTime() default "from";

    String endTime() default "to";

    String message() default "{javax.validation.constraints.CheckTimeValidation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        CheckTimeValidation[] value();
    }
}
