.class final Lg4/t;
.super Lg4/a;
.source "SourceFile"


# instance fields
.field private final a:Lg4/n0;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lg4/a;-><init>()V

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iput-object v0, p0, Lg4/t;->a:Lg4/n0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lg4/t;->a:Lg4/n0;

    invoke-virtual {v0}, Lg4/n0;->n()Z

    move-result v0

    return v0
.end method

.method public final b(Lg4/i;)Lg4/a;
    .locals 2

    iget-object v0, p0, Lg4/t;->a:Lg4/n0;

    new-instance v1, Lg4/p;

    invoke-direct {v1, p0, p1}, Lg4/p;-><init>(Lg4/t;Lg4/i;)V

    sget-object p1, Lg4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p1, v1}, Lg4/n0;->g(Ljava/util/concurrent/Executor;Lg4/h;)Lg4/l;

    return-object p0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lg4/t;->a:Lg4/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg4/n0;->v(Ljava/lang/Object;)Z

    return-void
.end method
