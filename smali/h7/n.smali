.class public Lh7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->c()Lr9/i;

    move-result-object v0

    new-instance v1, Lt9/b;

    invoke-direct {v1, p1, p2, p3}, Lt9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lr9/i;->f(Lt9/b;)Lgc/b;

    move-result-object p1

    new-instance p2, Lh7/n$a;

    invoke-direct {p2, p0}, Lh7/n$a;-><init>(Lh7/n;)V

    invoke-interface {p1, p2}, Lgc/b;->W(Lgc/d;)V

    return-void
.end method
