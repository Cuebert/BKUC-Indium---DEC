.class public final La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/a$f;,
        La2/a$b;,
        La2/a$c;,
        La2/a$d;,
        La2/a$g;,
        La2/a$a;,
        La2/a$e;
    }
.end annotation


# static fields
.field public static final a:Lm5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La2/a;

    invoke-direct {v0}, La2/a;-><init>()V

    sput-object v0, La2/a;->a:Lm5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm5/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm5/b<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-class v0, La2/l;

    sget-object v1, La2/a$e;->a:La2/a$e;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 2
    const-class v0, Ld2/a;

    sget-object v1, La2/a$a;->a:La2/a$a;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 3
    const-class v0, Ld2/f;

    sget-object v1, La2/a$g;->a:La2/a$g;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 4
    const-class v0, Ld2/d;

    sget-object v1, La2/a$d;->a:La2/a$d;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 5
    const-class v0, Ld2/c;

    sget-object v1, La2/a$c;->a:La2/a$c;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 6
    const-class v0, Ld2/b;

    sget-object v1, La2/a$b;->a:La2/a$b;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    .line 7
    const-class v0, Ld2/e;

    sget-object v1, La2/a$f;->a:La2/a$f;

    invoke-interface {p1, v0, v1}, Lm5/b;->a(Ljava/lang/Class;Ll5/d;)Lm5/b;

    return-void
.end method
