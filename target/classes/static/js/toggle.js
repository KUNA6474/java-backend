var users =[
    {
        "name" : "john doe",
        "gender":"Male",
        "image" : "/images/john.png"
    },
        {
        "name" : "jane doe",
        "gender":"Female",
        "image" : "/images/jane.png"
    }
];

var id=0;

function toggle() {
    id = (id + 1) % 2;
    var user =users[id];
    document.getElementById("user-name").innerHTML=user.name;
    document.getElementById("user-gender").innerHTML=user.gender;
    document.getElementById("user-image").src=user.image;


}