const addForm = document.getElementById("addForm");
const title = document.querySelector("[name='title']");

addForm.addEventListener("submit", (e) => {
    if(title.value.trim().length == 0){
        alert("제목을 입력하세요!");
        title.focus();
        e.preventDefault();
    }
});