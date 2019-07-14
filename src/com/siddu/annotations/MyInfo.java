package com.siddu.annotations;

import java.lang.annotation.Documented;

@Documented
public @interface MyInfo {
    String authour();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";

    String[] reviewers();


}
