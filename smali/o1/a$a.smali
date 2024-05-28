.class Lo1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/a;->b(Landroid/content/Context;Lcom/birbit/android/jobqueue/scheduling/Scheduler$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/a;


# direct methods
.method constructor <init>(Lo1/a;)V
    .locals 0

    iput-object p1, p0, Lo1/a$a;->a:Lo1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start(Lv1/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo1/a$a;->a:Lo1/a;

    invoke-static {v0, p1}, Lo1/a;->g(Lo1/a;Lv1/a;)V

    .line 2
    iget-object v0, p0, Lo1/a$a;->a:Lo1/a;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->e(Lv1/a;)Z

    move-result p1

    return p1
.end method

.method public stop(Lv1/a;)Z
    .locals 1

    iget-object v0, p0, Lo1/a$a;->a:Lo1/a;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/scheduling/Scheduler;->f(Lv1/a;)Z

    move-result p1

    return p1
.end method
