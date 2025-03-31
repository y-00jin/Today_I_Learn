### Thymeleaf 장점 

서버 없이 html 파일을 열어도 구조 확인이 가능 

→ 서버를 사용해 실행하면 내용이 치환됨

<br>

### CODE 

[ hello-template.html ]

``` html
<html xmlns:th="http://www.thymeleaf.org">
<body>
<p th:text="'hello ' + ${name}">hello! empty</p>
</body>
</html>
``` 


[ HelloController ]

``` java
@Controller
public class HelloController {

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
}
```


### 결과 


❓ 서버 구동하기 전 hello-template.html 경로로 접근한다면? 


🗨️ th:text에 설정한 값이 아닌 기본 값 `hello! empty` 출력


![img](https://postfiles.pstatic.net/MjAyNDA4MDlfMjEz/MDAxNzIzMTg2NTc2ODkz.ZDI8QaoH_M7iJc9dSyM6ZkrDqG-_TqSDvSrhmi1_HjAg.ztiOe9OGUEkkJg3N3OCvvPruJqfpHqL6ZK97onPOddog.PNG/image.png?type=w966) 


정상적으로 서버 구동 후 hello-mvc 경로로 접근하면 name 파라미터로 넘긴 값으로 치환되어 출력되는 것을 볼 수 있음

![img](https://postfiles.pstatic.net/MjAyNDA4MDlfMjIg/MDAxNzIzMTg2ODcwODAz.LarGPSKMobbYEK-9PT-2XrR7nYO2rDThPftNy4HEfBog.cvAXLWkKQd0ORJXe9WXfjlpaJWkTS0VUF6cFS6s0Lt4g.PNG/image.png?type=w966)
