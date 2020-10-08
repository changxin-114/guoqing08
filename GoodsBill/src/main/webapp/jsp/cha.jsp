<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/selectAll" method="post">
    请选择区域:
    <select name="goodsDistrict">
        <option value="1">朝阳</option>
        <option value="2">海淀</option>
        <option value="3">丰台</option>
        <option value="4">西城</option>
        <option value="5">昌平</option>
    </select>
    <input type="submit" value="查询" />
</form>

</body>
</html>
