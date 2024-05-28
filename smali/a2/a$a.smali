.class final La2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Ld2/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:La2/a$a;

.field private static final b:Ll5/c;

.field private static final c:Ll5/c;

.field private static final d:Ll5/c;

.field private static final e:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La2/a$a;

    invoke-direct {v0}, La2/a$a;-><init>()V

    sput-object v0, La2/a$a;->a:La2/a$a;

    const-string v0, "window"

    .line 2
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    .line 3
    invoke-static {}, Lo5/a;->b()Lo5/a;

    move-result-object v1

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v1, v2}, Lo5/a;->c(I)Lo5/a;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lo5/a;->a()Lo5/d;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$a;->b:Ll5/c;

    const-string v0, "logSourceMetrics"

    .line 8
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    .line 9
    invoke-static {}, Lo5/a;->b()Lo5/a;

    move-result-object v1

    const/4 v2, 0x2

    .line 10
    invoke-virtual {v1, v2}, Lo5/a;->c(I)Lo5/a;

    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lo5/a;->a()Lo5/d;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$a;->c:Ll5/c;

    const-string v0, "globalMetrics"

    .line 14
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    .line 15
    invoke-static {}, Lo5/a;->b()Lo5/a;

    move-result-object v1

    const/4 v2, 0x3

    .line 16
    invoke-virtual {v1, v2}, Lo5/a;->c(I)Lo5/a;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lo5/a;->a()Lo5/d;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$a;->d:Ll5/c;

    const-string v0, "appNamespace"

    .line 20
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    .line 21
    invoke-static {}, Lo5/a;->b()Lo5/a;

    move-result-object v1

    const/4 v2, 0x4

    .line 22
    invoke-virtual {v1, v2}, Lo5/a;->c(I)Lo5/a;

    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lo5/a;->a()Lo5/d;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, La2/a$a;->e:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ld2/a;

    check-cast p2, Ll5/e;

    invoke-virtual {p0, p1, p2}, La2/a$a;->b(Ld2/a;Ll5/e;)V

    return-void
.end method

.method public b(Ld2/a;Ll5/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, La2/a$a;->b:Ll5/c;

    invoke-virtual {p1}, Ld2/a;->d()Ld2/f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 2
    sget-object v0, La2/a$a;->c:Ll5/c;

    invoke-virtual {p1}, Ld2/a;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 3
    sget-object v0, La2/a$a;->d:Ll5/c;

    invoke-virtual {p1}, Ld2/a;->b()Ld2/b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    .line 4
    sget-object v0, La2/a$a;->e:Ll5/c;

    invoke-virtual {p1}, Ld2/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
