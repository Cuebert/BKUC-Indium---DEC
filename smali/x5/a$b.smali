.class final Lx5/a$b;
.super Lx5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lx5/f;

.field private e:Lx5/d$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx5/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx5/d;
    .locals 8

    new-instance v7, Lx5/a;

    iget-object v1, p0, Lx5/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lx5/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lx5/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lx5/a$b;->d:Lx5/f;

    iget-object v5, p0, Lx5/a$b;->e:Lx5/d$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lx5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx5/f;Lx5/d$b;Lx5/a$a;)V

    return-object v7
.end method

.method public b(Lx5/f;)Lx5/d$a;
    .locals 0

    iput-object p1, p0, Lx5/a$b;->d:Lx5/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lx5/d$a;
    .locals 0

    iput-object p1, p0, Lx5/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lx5/d$a;
    .locals 0

    iput-object p1, p0, Lx5/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lx5/d$b;)Lx5/d$a;
    .locals 0

    iput-object p1, p0, Lx5/a$b;->e:Lx5/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lx5/d$a;
    .locals 0

    iput-object p1, p0, Lx5/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
