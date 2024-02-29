<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../includes/header.jsp" %>
    <div class="col-lg-7">
        <div class="p-5">
            <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">게시판 상세조회</h1>
            </div>
            <form role="form" action="/board/modify" method="post">
                <div class="form-group">
                    <label>Bno</label>
                    <input type="text" class="form-control" id="bno" name="bno" value='<c:out value="${board.bno}" />' readonly />
                </div>
                <div class="form-group">
                    <label>제목</label>
                    <input type="text" class="form-control" id="title" name="title" value='<c:out value="${board.title}" />'/>
                </div>
                <div class="form-group">
                    <label>내용</label>
                    <textarea rows="5" class="form-control" id="content"  name="content"><c:out value="${board.content}" /></textarea>
                </div>
                <div class="form-group">
                    <label>작성자</label>
                    <input type="text" class="form-control" id="writer"  name="writer" value='<c:out value="${board.writer}" />' readonly />
                </div>
                <button class="btn btn-primary" type="submit">
                    수정하기
                </button>
                <button class="btn btn-primary" type="submit" formaction="/board/remove" formmethod="post">
                    삭제하기
                </button>
                <button class="btn btn-default" type="button" onclick="location.href='/'">
                    목록
                </button>
            </form>
        </div>
        <div style="margin-left:48px;">댓글</div>
        <div id="reply" style="margin-left:48px;">
            <label>Reply</label>
            <input type="text" style="width:65%;">
            <button class="btn btn-primary">New Reply</button>
        </div>
    </div>
</div>
<script type="text/javascript" src="/resources/js/reply.js"></script>
<script>
    $(document).ready(functionh(){
        console.log(replyService);
    });
</script>
<%@ include file="../includes/footer.jsp" %>


<!--<button class="btn btn-primary" type="button" onclick="location.href='/board/modify?bno=<c:out value="${board.bno}" />'">수정하기</button>-->
<!--<button class="btn btn-default" type="button" onclick="location.href='/'">목록</button>-->