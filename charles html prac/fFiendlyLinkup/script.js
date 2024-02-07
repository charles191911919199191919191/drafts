const buttons = document.querySelectorAll('.button');
const contentContainer = document.getElementById('content');
const themeSwitch = document.getElementById('theme-switch');
const body = document.body;

buttons.forEach(button => {
    button.addEventListener('click', function () {
        const pageName = this.classList[0]; // Assumes class names match HTML file names
        const contentUrl = `${pageName}home.html`;

        // Fetch and load the content
        fetch(contentUrl)``
            .then(response => response.text())
            .then(data => {
                contentContainer.innerHTML = data;
            })
            .catch(error => console.error('Error:', error));
    });
});

themeSwitch.addEventListener('change', () => {
    body.classList.toggle('dark-theme');
    body.classList.toggle('light-theme');
});
