.class Lq7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/a;->y(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Z

.field final synthetic o:Lq7/a;


# direct methods
.method constructor <init>(Lq7/a;Z)V
    .locals 0

    iput-object p1, p0, Lq7/a$a;->o:Lq7/a;

    iput-boolean p2, p0, Lq7/a$a;->n:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lq7/a$a;->o:Lq7/a;

    invoke-static {v0}, Lq7/a;->x(Lq7/a;)Lq7/a$b;

    move-result-object v0

    iget-boolean v1, p0, Lq7/a$a;->n:Z

    invoke-interface {v0, v1}, Lq7/a$b;->a(Z)V

    return-void
.end method
