# Jetpack-Compose-App


## 1.Compose Component
- 인트로
    + Text, Button, Modifier, Surface, Box, Row, Column, BoxWithConstraints, Image, Coli 라이브러리,
      Card, CheckBox, TextField, TopAppBar, Slot API, Scaffold

- Text
    + 텍스트 영역의 크기에는 dp 단위 사용하고 나머지는 sp 사용
    + 사용하는 변수는 text, modifier, color, fontSize, fontStyle, fontWeight, fontFamily,
      letterSpacing, textDecoration, textAlign, lineHeight, overflow, softWrap, maxLines,
      onTextLayout, style

- Button
    + Component 를 조합하여 내부 배치(RowScope 가 기본이기에 이들은 row 정렬 됨)
    + 패딩, 마진 영역을 상하좌우 각각 설정 가능
    + onClick, modifier, enabled, shape, colors, elevation, border, contentPadding
      interactionSource, content

- Modifier
    + Component 의 크기, 색상, 패딩, 여백 변경 동작 처리
    + 사용자 입력, 클릭, 스크롤, 드래그 등의 상호작용 처리

- Surface
    + 머터리얼의 핵심적인 메타포
    + clipping, elevation, borders, background, content color, blocking touch
      (뒤쪽으로 터치를 전달하지 않음)
    + UI 개발의 기본
    + color 를 설정한 경우 하위 컴포넌트 일괄 적용