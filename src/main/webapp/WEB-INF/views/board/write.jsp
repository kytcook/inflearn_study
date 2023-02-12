<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
<h2>게시판 글쓰기</h2>
<form action="write.do" method="post">
	<table>
		<tr>
			<th>제목</th>
			<td><input name="title"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="5" name="content" style="width: 600px;"></textarea></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input name="writer"></td>
		</tr>
		<tr>
			<td><button>쓰기</button></td>
			<td><button>새로입력</button></td>
			<td><button>취소</button></td>
		</tr>
	</table>
</form>
</body>
</html>