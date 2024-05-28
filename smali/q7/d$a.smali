.class Lq7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/d;->z(ZLq7/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Z

.field final synthetic o:Lq7/d$c;

.field final synthetic p:Lq7/d;


# direct methods
.method constructor <init>(Lq7/d;ZLq7/d$c;)V
    .locals 0

    iput-object p1, p0, Lq7/d$a;->p:Lq7/d;

    iput-boolean p2, p0, Lq7/d$a;->n:Z

    iput-object p3, p0, Lq7/d$a;->o:Lq7/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lq7/d$a;->p:Lq7/d;

    invoke-static {v0}, Lq7/d;->x(Lq7/d;)Lq7/d$b;

    move-result-object v0

    iget-boolean v1, p0, Lq7/d$a;->n:Z

    iget-object v2, p0, Lq7/d$a;->o:Lq7/d$c;

    invoke-interface {v0, v1, v2}, Lq7/d$b;->a(ZLq7/d$c;)V

    return-void
.end method
