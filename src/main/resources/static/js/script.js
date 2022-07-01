$(document).ready(function(){
    // Activate tooltip
    $('[data-toggle="tooltip"]').tooltip();

    // Select/Deselect checkboxes
    var checkbox = $('table tbody input[type="checkbox"]');
    $("#selectAll").click(function(){
        if(this.checked){
            checkbox.each(function(){
                this.checked = true;
            });
        } else{
            checkbox.each(function(){
                this.checked = false;
            });
        }
    });

    checkbox.click(function(){
        if(!this.checked){
            $("#selectAll").prop("checked", false);
        }
    });
});

function onClickUpdate(id) {
    const editId = `dep-edit-${id}`;
    document.getElementById('upd-id').value = $(`#${editId}`).data('id');
    document.getElementById('upd-name').value = $(`#${editId}`).data('name');
    document.getElementById('upd-telno').value = $(`#${editId}`).data('telno');
}

function onClickDelete(id) {
    document.getElementById('del-id').value = id;
}