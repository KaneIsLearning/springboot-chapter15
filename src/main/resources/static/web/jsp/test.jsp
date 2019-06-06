<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>购买产品测试</title>
    <script type="text/javascript" src="/web/js/jquery-3.1.1.min.js"></script>
</head>
<script type="text/javascript">
    var params = {
        userId:1,
        productId:1,
        quantity:3
    };
    $.post("./purchase",params,function (result) {
        alert(result.message);
    })
</script>
<body>
    <h1>抢购产品测试</h1>
</body>
</html>