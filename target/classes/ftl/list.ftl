<html>

	<head>学生列表</head>
	<body>
		<table>
			<tr>
				<td>序号</td>
				<td>id</td>
				<td>姓名</td>
				<td>性别</td>
				<td>地址</td>
			</tr>
			
			<#list list as user>
				<tr>
				<td>${user_index}</td>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.sex}</td>
				<td>${user.address}</td>
			</tr>
			</#list>
		</table>
	</body>

</html>