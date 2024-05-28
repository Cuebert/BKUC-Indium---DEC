.class Ln6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln6/c;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln6/c;


# direct methods
.method constructor <init>(Ln6/c;)V
    .locals 0

    iput-object p1, p0, Ln6/c$a;->a:Ln6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh7/j;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/16 v0, 0xca

    if-eq p1, v0, :cond_0

    const-string p1, "EventStreamManager"

    const-string v0, "addEvent: Failed to post events. Ignore and do nothing"

    .line 2
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
