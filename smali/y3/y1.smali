.class final Ly3/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Ly3/t4;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ly3/y1;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;

.field private static final d:Ll5/c;

.field private static final e:Ll5/c;

.field private static final f:Ll5/c;

.field private static final g:Ll5/c;

.field private static final h:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly3/y1;

    invoke-direct {v0}, Ly3/y1;-><init>()V

    sput-object v0, Ly3/y1;->a:Ly3/y1;

    const-string v0, "durationMs"

    .line 1
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 2
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->b:Ll5/c;

    const-string v0, "imageSource"

    .line 6
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 7
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->c:Ll5/c;

    const-string v0, "imageFormat"

    .line 11
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 12
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x3

    .line 13
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->d:Ll5/c;

    const-string v0, "imageByteSize"

    .line 16
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 17
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x4

    .line 18
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->e:Ll5/c;

    const-string v0, "imageWidth"

    .line 21
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 22
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x5

    .line 23
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->f:Ll5/c;

    const-string v0, "imageHeight"

    .line 26
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 27
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x6

    .line 28
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->g:Ll5/c;

    const-string v0, "rotationDegrees"

    .line 31
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Ly3/e8;

    .line 32
    invoke-direct {v1}, Ly3/e8;-><init>()V

    const/4 v2, 0x7

    .line 33
    invoke-virtual {v1, v2}, Ly3/e8;->a(I)Ly3/e8;

    invoke-virtual {v1}, Ly3/e8;->b()Ly3/i8;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Ly3/y1;->h:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Ly3/t4;

    check-cast p2, Ll5/e;

    sget-object v0, Ly3/y1;->b:Ll5/c;

    .line 2
    invoke-virtual {p1}, Ly3/t4;->g()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->c:Ll5/c;

    .line 3
    invoke-virtual {p1}, Ly3/t4;->b()Ly3/s4;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->d:Ll5/c;

    .line 4
    invoke-virtual {p1}, Ly3/t4;->a()Ly3/m4;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->e:Ll5/c;

    .line 5
    invoke-virtual {p1}, Ly3/t4;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->f:Ll5/c;

    .line 6
    invoke-virtual {p1}, Ly3/t4;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->g:Ll5/c;

    .line 7
    invoke-virtual {p1}, Ly3/t4;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Ly3/y1;->h:Ll5/c;

    .line 8
    invoke-virtual {p1}, Ly3/t4;->f()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
