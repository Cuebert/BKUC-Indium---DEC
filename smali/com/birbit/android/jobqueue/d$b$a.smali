.class final Lcom/birbit/android/jobqueue/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/messaging/MessagePredicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/birbit/android/jobqueue/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Lt1/b;)Z
    .locals 2

    iget-object v0, p1, Lt1/b;->a:Lt1/g;

    sget-object v1, Lt1/g;->s:Lt1/g;

    if-ne v0, v1, :cond_0

    check-cast p1, Lu1/e;

    invoke-virtual {p1}, Lu1/e;->c()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
