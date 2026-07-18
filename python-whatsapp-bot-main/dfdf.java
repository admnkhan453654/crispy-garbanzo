<script>
    document.getElementById('loginForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent standard page reload
        
        const userIn = document.getElementById('username').value;
        const passIn = document.getElementById('password').value;
        const feedback = document.getElementById('feedback');

        if (userIn === "admin" && passIn === "ak20223") {
            feedback.className = "message success";
            feedback.innerText = "ACCESS GRANTED. INITIALIZING...";
            
            // Redirects to anthony.html after 1.5 seconds to simulate a system loading sequence
            setTimeout(function() {
                window.location.href = "anthony.html";
            }, 1500);
            
        } else {
            feedback.className = "message error";
            feedback.innerText = "ACCESS DENIED. INVALID CREDENTIALS.";
        }
    });
</script>