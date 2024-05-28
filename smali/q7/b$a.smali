.class Lq7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/b;->z(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lq7/b;


# direct methods
.method constructor <init>(Lq7/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq7/b$a;->o:Lq7/b;

    iput-object p2, p0, Lq7/b$a;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lq7/b$a;->o:Lq7/b;

    invoke-static {v0}, Lq7/b;->x(Lq7/b;)Lq7/b$c;

    move-result-object v0

    iget-object v1, p0, Lq7/b$a;->n:Ljava/lang/String;

    invoke-interface {v0, v1}, Lq7/b$c;->b(Ljava/lang/String;)V

    return-void
.end method
