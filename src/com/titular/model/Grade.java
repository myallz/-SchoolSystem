package com.titular.model;

public class Grade {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.GradeID
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    private Integer gradeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.GradeName
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    private String gradename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.GradeID
     *
     * @return the value of grade.GradeID
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    public Integer getGradeid() {
        return gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.GradeID
     *
     * @param gradeid the value for grade.GradeID
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.GradeName
     *
     * @return the value of grade.GradeName
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    public String getGradename() {
        return gradename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.GradeName
     *
     * @param gradename the value for grade.GradeName
     *
     * @mbggenerated Mon Nov 27 10:19:20 CST 2017
     */
    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
    }
}