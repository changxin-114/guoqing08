<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/upd?id=${goods.id}" method="post">
        <table border="1px">
            <tr>
                <td>商品编号</td>
                <td><input type="text" name="id" value="${goods.id}" /></td>
            </tr>

            <tr>
                <td>商品名称</td>
                <td><input type="text" name="goodsname" value="${goods.goodsname}" /></td>
            </tr>

            <tr>
                <td>商品价格</td>
                <td><input type="text" name="goodsprice" value="${goods.goodsprice}" /></td>
            </tr>

            <tr>
                <td>库存数量</td>
                <td><input type="text" name="goodscount" value="${goods.goodscount}" /></td>
            </tr>

            <tr>
                <td>订单状态</td>
                <td>
                    <select name="billstatus" value="${goods.billstatus}">
                        <option value="0">待处理</option>
                        <option value="1">处理中</option>
                        <option value="2">已处理</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交" /><a href=""><input type="button" value="返回" /></a></td>
            </tr>

        </table>


    </form>

</body>
</html>
