 (function(){
    $('.create-site-action').on('click',function(){
        $.ajax({
            url: '/create/site',
            success: function(data){
                console.log(data);
            }
        });
    });


    $('.destroy-site-action').on('click',function(){
        $.ajax({
            url: '/destroy/all',
            success: function(data){
                console.log(data);
            }
        });
    });

    $('.create-site-action-view').on('click',function(){
        console.log('function called');
        $('.container-fluid').load("blank_container");
    });

 })();


