.class public Ln9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ln9/d;
    .locals 3

    .line 1
    new-instance v0, Ln9/h;

    .line 2
    invoke-static {}, Ln9/g;->b()Lob/d0;

    move-result-object v1

    .line 3
    invoke-static {}, Lp9/c;->e()Lp9/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ln9/h;-><init>(Lob/d0;Lgc/c$a;)V

    .line 4
    invoke-static {}, Ln9/g;->c()Ln9/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/h;->i(Ln9/b;)Ln9/d;

    move-result-object v0

    return-object v0
.end method
