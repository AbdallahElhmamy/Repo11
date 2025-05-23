@Test
void testAddLesson() {
    Lesson lesson = new Lesson();
    Course course = new Course();
    lesson.setLessonName("Lesson 1");
    lesson.setOTP("12345");
    lesson.setCourseId(course);

    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    doNothing().when(lessonService).addLesson(any(Lesson.class), any(HttpServletRequest.class));

    ResponseEntity<String> response = lessonController.addLesson(lesson, mockRequest);
    assertEquals(200, response.getStatusCodeValue());
    assertEquals("Lesson added successfully.", response.getBody());
    verify(lessonService, times(1)).addLesson(eq(lesson), eq(mockRequest));
}

@Test
void testStudentEnterLesson() {
    int lessonId = 1;
    int courseId = 1;
    String OTP = "12345";

    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    doNothing().when(lessonService).StudentEnterLesson(eq(courseId), eq(lessonId), eq(OTP), eq(mockRequest));

    ResponseEntity<?> response = lessonController.StudentEnterLesson(courseId, lessonId, OTP, mockRequest);
    assertEquals(200, response.getStatusCodeValue());
    assertEquals("Student entered lesson successfully.", response.getBody());
    verify(lessonService, times(1)).StudentEnterLesson(eq(courseId), eq(lessonId), eq(OTP), eq(mockRequest));
}
