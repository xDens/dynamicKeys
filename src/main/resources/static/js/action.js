var count = 0;

function addKey() {
    var customerRow = '<tr>' +
                                '<td><input id=key' + count + '></input></td>' +
                                '<td><input id=value' + count + '></input></td>' +
                                '</tr>';
                $('#myTable tbody').append(customerRow);
    count++;
}

function collectData() {

var keyObj;
var listLocal = [];
var dataObj;

    //collect the data in dynamic form with fields for keys and values;
    for (i=0; i < count; i++) {
        keyObj = {
            key : $("#key" + i).val(),
            value : $("#value" + i).val()
        }
        listLocal.push(keyObj);
    }

    //dataObj represents form data here with all fields;
    dataObj = {
        test : $("#test").val(),
        list : listLocal
    }


    // DO POST
        	$.ajax({
    			type : "POST",
    			contentType : "application/json",
    			accept: 'text/plain',
    			url : "/save",
    			data : JSON.stringify(dataObj),
    			dataType: 'text',
    			success : function(result) {

    				// fill status message on view
    				$("#status").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
    											result +
    										  "</p>");
    			},
    			error : function(e) {
    			// fill error message on view
                    				$("#status").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                    											e +
                    										  "</p>");

    			}
    		});
}

function clearKeys() {
    count = 0;
    $('#myTable tbody').empty();
}