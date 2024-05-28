.class Le8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/b;->g(JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Le8/b;


# direct methods
.method constructor <init>(Le8/b;)V
    .locals 0

    iput-object p1, p0, Le8/b$b;->n:Le8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Le8/b$b;->n:Le8/b;

    invoke-static {v0}, Le8/b;->a(Le8/b;)Le8/a;

    move-result-object v0

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->q4:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/k0;->W0(I)V

    return-void
.end method
