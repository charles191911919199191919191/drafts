function createPost() {
    var postInput = document.getElementById("postInput").value;
    if (postInput.trim() === "") {
        alert("Post content cannot be empty!");
        return;
    }

    var post = {
        content: postInput,
        likes: 0,
        comments: []
    };

    var posts = JSON.parse(localStorage.getItem("posts")) || [];
    posts.push(post);
    localStorage.setItem("posts", JSON.stringify(posts));

    document.getElementById("postInput").value = "";
    displayPosts();
}

function likePost(index) {
    var posts = JSON.parse(localStorage.getItem("posts"));
    posts[index].likes++;
    localStorage.setItem("posts", JSON.stringify(posts));
    displayPosts();
}

function commentPost(index) {
    var commentInput = prompt("Enter your comment:");
    if (commentInput) {
        var posts = JSON.parse(localStorage.getItem("posts"));
        posts[index].comments.push(commentInput);
        localStorage.setItem("posts", JSON.stringify(posts));
        displayPosts();
    }
}

function displayPosts() {
    var posts = JSON.parse(localStorage.getItem("posts")) || [];
    var postsContainer = document.getElementById("posts");
    postsContainer.innerHTML = "";

    posts.forEach(function(post, index) {
        var postElement = document.createElement("div");
        postElement.className = "post";
        postElement.innerHTML = `
            <p>${post.content}</p>
            <button class="like-button" onclick="likePost(${index})">Like (${post.likes})</button>
            <button class="comment-button" onclick="commentPost(${index})">Comment</button>
        `;

        post.comments.forEach(function(comment) {
            var commentElement = document.createElement("div");
            commentElement.className = "comment";
            commentElement.textContent = comment;
            postElement.appendChild(commentElement);
        });

        postsContainer.appendChild(postElement);
    });
}

displayPosts();
