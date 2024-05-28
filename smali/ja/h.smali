.class public final synthetic Lja/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# instance fields
.field public final synthetic a:Landroidx/activity/result/b;

.field public final synthetic b:Lja/j$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/result/b;Lja/j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/h;->a:Landroidx/activity/result/b;

    iput-object p2, p0, Lja/h;->b:Lja/j$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lja/h;->a:Landroidx/activity/result/b;

    iget-object v1, p0, Lja/h;->b:Lja/j$b;

    check-cast p1, Landroid/app/PendingIntent;

    invoke-static {v0, v1, p1}, Lja/j;->d(Landroidx/activity/result/b;Lja/j$b;Landroid/app/PendingIntent;)V

    return-void
.end method
