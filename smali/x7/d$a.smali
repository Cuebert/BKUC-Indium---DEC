.class Lx7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/d;->b(Lx7/d$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lx7/d$e;

.field final synthetic o:Lx7/d;


# direct methods
.method constructor <init>(Lx7/d;Lx7/d$e;)V
    .locals 0

    iput-object p1, p0, Lx7/d$a;->o:Lx7/d;

    iput-object p2, p0, Lx7/d$a;->n:Lx7/d$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx7/d$a;->o:Lx7/d;

    invoke-static {v0}, Lx7/d;->a(Lx7/d;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lx7/d$a;->n:Lx7/d$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lx7/d$a;->o:Lx7/d;

    invoke-static {v0}, Lx7/d;->a(Lx7/d;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lx7/d$a;->n:Lx7/d$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
