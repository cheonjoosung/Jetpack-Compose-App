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