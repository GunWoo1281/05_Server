const goToList = document.getElementById("goToList");

goToList.addEventListener("click",()=>{

    location.href="/";

});

const todoNo = new URLSearchParams(location.search).get("todoNo");

document.getElementById("completeBtn").addEventListener("click", () => {
    location.href="/todo/complete?todoNo="+todoNo;
});

document.getElementById("updateBtn").addEventListener("click", () => {
    location.href="/todo/update?todoNo="+todoNo;
});

document.getElementById("deleteBtn").addEventListener("click", () => {
    if(!confirm("정말 삭제하시겠습니까?")){
        return;
    }

    location.href="/todo/delete?todoNo="+todoNo;
});