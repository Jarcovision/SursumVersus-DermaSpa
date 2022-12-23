$(document).ready(()=> {

    function list() {
        $.ajax({
        url:"http://localhost:8080/apilist",
        type: "GET",
        dataType: "json",
        success: function (res) {
            let data = "";
            res.forEach(element =>{
                data+=
                    <tr>
                        <td>${element.id}</td>
                        <td>${element.nombre}</td>
                        <td>${element.apellidos}</td>
                        <td>${element.curso}</td>
                        <td>${element.nota}</td>
                    </tr>
            });
            $("#tbody").html(data);
        }
    })
}
})