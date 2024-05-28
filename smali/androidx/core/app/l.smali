.class Landroidx/core/app/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/l$h;,
        Landroidx/core/app/l$a;,
        Landroidx/core/app/l$b;,
        Landroidx/core/app/l$d;,
        Landroidx/core/app/l$e;,
        Landroidx/core/app/l$f;,
        Landroidx/core/app/l$c;,
        Landroidx/core/app/l$g;,
        Landroidx/core/app/l$i;,
        Landroidx/core/app/l$j;,
        Landroidx/core/app/l$k;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/Notification$Builder;

.field private final c:Landroidx/core/app/k$e;

.field private d:Landroid/widget/RemoteViews;

.field private e:Landroid/widget/RemoteViews;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Landroid/os/Bundle;

.field private h:I

.field private i:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Landroidx/core/app/k$e;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l;->f:Ljava/util/List;

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l;->g:Landroid/os/Bundle;

    .line 4
    iput-object p1, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    .line 5
    iget-object v0, p1, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    iput-object v0, p0, Landroidx/core/app/l;->a:Landroid/content/Context;

    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 7
    iget-object v1, p1, Landroidx/core/app/k$e;->K:Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/core/app/l$h;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v1, p1, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    .line 9
    :goto_0
    iget-object v0, p1, Landroidx/core/app/k$e;->R:Landroid/app/Notification;

    .line 10
    iget-object v1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-wide v3, v0, Landroid/app/Notification;->when:J

    invoke-virtual {v1, v3, v4}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->icon:I

    iget v4, v0, Landroid/app/Notification;->iconLevel:I

    .line 11
    invoke-virtual {v1, v3, v4}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 12
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroidx/core/app/k$e;->i:Landroid/widget/RemoteViews;

    .line 13
    invoke-virtual {v1, v3, v4}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, v0, Landroid/app/Notification;->vibrate:[J

    .line 14
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->ledARGB:I

    iget v4, v0, Landroid/app/Notification;->ledOnMS:I

    iget v5, v0, Landroid/app/Notification;->ledOffMS:I

    .line 15
    invoke-virtual {v1, v3, v4, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->flags:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 16
    :goto_1
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 17
    :goto_2
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    .line 18
    :goto_3
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, v0, Landroid/app/Notification;->defaults:I

    .line 19
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->e:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->f:Ljava/lang/CharSequence;

    .line 21
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->k:Ljava/lang/CharSequence;

    .line 22
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->g:Landroid/app/PendingIntent;

    .line 23
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 24
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->h:Landroid/app/PendingIntent;

    iget v7, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v7, v7, 0x80

    if-eqz v7, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    .line 25
    :goto_4
    invoke-virtual {v1, v3, v7}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v3, p1, Landroidx/core/app/k$e;->j:Landroid/graphics/Bitmap;

    .line 26
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, p1, Landroidx/core/app/k$e;->l:I

    .line 27
    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, p1, Landroidx/core/app/k$e;->t:I

    iget v7, p1, Landroidx/core/app/k$e;->u:I

    iget-boolean v8, p1, Landroidx/core/app/k$e;->v:Z

    .line 28
    invoke-virtual {v1, v3, v7, v8}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 29
    iget-object v1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v3, p1, Landroidx/core/app/k$e;->q:Ljava/lang/CharSequence;

    .line 30
    invoke-static {v1, v3}, Landroidx/core/app/l$a;->c(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-boolean v3, p1, Landroidx/core/app/k$e;->o:Z

    invoke-static {v1, v3}, Landroidx/core/app/l$a;->d(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v3, p1, Landroidx/core/app/k$e;->m:I

    .line 31
    invoke-static {v1, v3}, Landroidx/core/app/l$a;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 32
    iget-object v1, p1, Landroidx/core/app/k$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/app/k$a;

    .line 33
    invoke-direct {p0, v3}, Landroidx/core/app/l;->b(Landroidx/core/app/k$a;)V

    goto :goto_5

    .line 34
    :cond_5
    iget-object v1, p1, Landroidx/core/app/k$e;->D:Landroid/os/Bundle;

    if-eqz v1, :cond_6

    .line 35
    iget-object v3, p0, Landroidx/core/app/l;->g:Landroid/os/Bundle;

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 36
    :cond_6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    iget-object v3, p1, Landroidx/core/app/k$e;->H:Landroid/widget/RemoteViews;

    iput-object v3, p0, Landroidx/core/app/l;->d:Landroid/widget/RemoteViews;

    .line 38
    iget-object v3, p1, Landroidx/core/app/k$e;->I:Landroid/widget/RemoteViews;

    iput-object v3, p0, Landroidx/core/app/l;->e:Landroid/widget/RemoteViews;

    .line 39
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Landroidx/core/app/k$e;->n:Z

    invoke-static {v3, v7}, Landroidx/core/app/l$b;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 40
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Landroidx/core/app/k$e;->z:Z

    invoke-static {v3, v7}, Landroidx/core/app/l$d;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 41
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Landroidx/core/app/k$e;->w:Ljava/lang/String;

    invoke-static {v3, v7}, Landroidx/core/app/l$d;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 42
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Landroidx/core/app/k$e;->y:Ljava/lang/String;

    invoke-static {v3, v7}, Landroidx/core/app/l$d;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 43
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Landroidx/core/app/k$e;->x:Z

    invoke-static {v3, v7}, Landroidx/core/app/l$d;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 44
    iget v3, p1, Landroidx/core/app/k$e;->O:I

    iput v3, p0, Landroidx/core/app/l;->h:I

    .line 45
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Landroidx/core/app/k$e;->C:Ljava/lang/String;

    invoke-static {v3, v7}, Landroidx/core/app/l$e;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 46
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget v7, p1, Landroidx/core/app/k$e;->E:I

    invoke-static {v3, v7}, Landroidx/core/app/l$e;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 47
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget v7, p1, Landroidx/core/app/k$e;->F:I

    invoke-static {v3, v7}, Landroidx/core/app/l$e;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 48
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Landroidx/core/app/k$e;->G:Landroid/app/Notification;

    invoke-static {v3, v7}, Landroidx/core/app/l$e;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 49
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v7, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v8, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v3, v7, v8}, Landroidx/core/app/l$e;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    const/16 v3, 0x1c

    if-ge v1, v3, :cond_7

    .line 50
    iget-object v1, p1, Landroidx/core/app/k$e;->c:Ljava/util/ArrayList;

    invoke-static {v1}, Landroidx/core/app/l;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iget-object v7, p1, Landroidx/core/app/k$e;->U:Ljava/util/ArrayList;

    invoke-static {v1, v7}, Landroidx/core/app/l;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_6

    .line 51
    :cond_7
    iget-object v1, p1, Landroidx/core/app/k$e;->U:Ljava/util/ArrayList;

    :goto_6
    if-eqz v1, :cond_8

    .line 52
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    .line 53
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 54
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v7}, Landroidx/core/app/l$e;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_7

    .line 55
    :cond_8
    iget-object v1, p1, Landroidx/core/app/k$e;->J:Landroid/widget/RemoteViews;

    iput-object v1, p0, Landroidx/core/app/l;->i:Landroid/widget/RemoteViews;

    .line 56
    iget-object v1, p1, Landroidx/core/app/k$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_b

    .line 57
    invoke-virtual {p1}, Landroidx/core/app/k$e;->d()Landroid/os/Bundle;

    move-result-object v1

    const-string v7, "android.car.EXTENSIONS"

    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_9

    .line 58
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 59
    :cond_9
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 60
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const/4 v10, 0x0

    .line 61
    :goto_8
    iget-object v11, p1, Landroidx/core/app/k$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_a

    .line 62
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iget-object v12, p1, Landroidx/core/app/k$e;->d:Ljava/util/ArrayList;

    .line 63
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/core/app/k$a;

    .line 64
    invoke-static {v12}, Landroidx/core/app/m;->a(Landroidx/core/app/k$a;)Landroid/os/Bundle;

    move-result-object v12

    .line 65
    invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_a
    const-string v10, "invisible_actions"

    .line 66
    invoke-virtual {v1, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 68
    invoke-virtual {p1}, Landroidx/core/app/k$e;->d()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v7, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 69
    iget-object v1, p0, Landroidx/core/app/l;->g:Landroid/os/Bundle;

    invoke-virtual {v1, v7, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 70
    :cond_b
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-lt v1, v7, :cond_c

    .line 71
    iget-object v7, p1, Landroidx/core/app/k$e;->T:Ljava/lang/Object;

    if-eqz v7, :cond_c

    .line 72
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v7}, Landroidx/core/app/l$f;->b(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    :cond_c
    const/16 v7, 0x18

    if-lt v1, v7, :cond_f

    .line 73
    iget-object v7, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Landroidx/core/app/k$e;->D:Landroid/os/Bundle;

    invoke-static {v7, v8}, Landroidx/core/app/l$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 74
    iget-object v7, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Landroidx/core/app/k$e;->s:[Ljava/lang/CharSequence;

    invoke-static {v7, v8}, Landroidx/core/app/l$g;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 75
    iget-object v7, p1, Landroidx/core/app/k$e;->H:Landroid/widget/RemoteViews;

    if-eqz v7, :cond_d

    .line 76
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v7}, Landroidx/core/app/l$g;->c(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 77
    :cond_d
    iget-object v7, p1, Landroidx/core/app/k$e;->I:Landroid/widget/RemoteViews;

    if-eqz v7, :cond_e

    .line 78
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v7}, Landroidx/core/app/l$g;->b(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 79
    :cond_e
    iget-object v7, p1, Landroidx/core/app/k$e;->J:Landroid/widget/RemoteViews;

    if-eqz v7, :cond_f

    .line 80
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v7}, Landroidx/core/app/l$g;->d(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_f
    const/4 v7, 0x0

    if-lt v1, v2, :cond_11

    .line 81
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget v9, p1, Landroidx/core/app/k$e;->L:I

    invoke-static {v8, v9}, Landroidx/core/app/l$h;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 82
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v9, p1, Landroidx/core/app/k$e;->r:Ljava/lang/CharSequence;

    invoke-static {v8, v9}, Landroidx/core/app/l$h;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 83
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v9, p1, Landroidx/core/app/k$e;->M:Ljava/lang/String;

    invoke-static {v8, v9}, Landroidx/core/app/l$h;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 84
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-wide v9, p1, Landroidx/core/app/k$e;->N:J

    invoke-static {v8, v9, v10}, Landroidx/core/app/l$h;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 85
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget v9, p1, Landroidx/core/app/k$e;->O:I

    invoke-static {v8, v9}, Landroidx/core/app/l$h;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 86
    iget-boolean v8, p1, Landroidx/core/app/k$e;->B:Z

    if-eqz v8, :cond_10

    .line 87
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-boolean v9, p1, Landroidx/core/app/k$e;->A:Z

    invoke-static {v8, v9}, Landroidx/core/app/l$h;->c(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 88
    :cond_10
    iget-object v8, p1, Landroidx/core/app/k$e;->K:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_11

    .line 89
    iget-object v8, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v8, v7}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v8

    .line 90
    invoke-virtual {v8, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v8

    .line 91
    invoke-virtual {v8, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v6

    .line 92
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_11
    if-lt v1, v3, :cond_12

    .line 93
    iget-object v1, p1, Landroidx/core/app/k$e;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/app/o;

    .line 94
    iget-object v6, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v3}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v3

    invoke-static {v6, v3}, Landroidx/core/app/l$i;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_9

    .line 95
    :cond_12
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v1, v3, :cond_13

    .line 96
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-boolean v6, p1, Landroidx/core/app/k$e;->Q:Z

    invoke-static {v3, v6}, Landroidx/core/app/l$j;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 97
    iget-object v3, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    .line 98
    invoke-static {v7}, Landroidx/core/app/k$d;->a(Landroidx/core/app/k$d;)Landroid/app/Notification$BubbleMetadata;

    move-result-object v6

    .line 99
    invoke-static {v3, v6}, Landroidx/core/app/l$j;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    :cond_13
    const/16 v3, 0x1f

    if-lt v1, v3, :cond_14

    .line 100
    iget v3, p1, Landroidx/core/app/k$e;->P:I

    if-eqz v3, :cond_14

    .line 101
    iget-object v6, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v6, v3}, Landroidx/core/app/l$k;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 102
    :cond_14
    iget-boolean p1, p1, Landroidx/core/app/k$e;->S:Z

    if-eqz p1, :cond_17

    .line 103
    iget-object p1, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    iget-boolean p1, p1, Landroidx/core/app/k$e;->x:Z

    if-eqz p1, :cond_15

    .line 104
    iput v4, p0, Landroidx/core/app/l;->h:I

    goto :goto_a

    .line 105
    :cond_15
    iput v5, p0, Landroidx/core/app/l;->h:I

    .line 106
    :goto_a
    iget-object p1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 107
    iget-object p1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v7}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 108
    iget p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x2

    and-int/lit8 p1, p1, -0x3

    .line 109
    iput p1, v0, Landroid/app/Notification;->defaults:I

    .line 110
    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    if-lt v1, v2, :cond_17

    .line 111
    iget-object p1, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    iget-object p1, p1, Landroidx/core/app/k$e;->w:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 112
    iget-object p1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    const-string v0, "silent"

    invoke-static {p1, v0}, Landroidx/core/app/l$d;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 113
    :cond_16
    iget-object p1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget v0, p0, Landroidx/core/app/l;->h:I

    invoke-static {p1, v0}, Landroidx/core/app/l$h;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_17
    return-void
.end method

.method private b(Landroidx/core/app/k$a;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    invoke-virtual {p1}, Landroidx/core/app/k$a;->d()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    const/16 v2, 0x17

    const/4 v3, 0x0

    if-lt v0, v2, :cond_1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->s()Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroidx/core/app/k$a;->h()Ljava/lang/CharSequence;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Landroidx/core/app/k$a;->a()Landroid/app/PendingIntent;

    move-result-object v2

    .line 5
    invoke-static {v0, v1, v2}, Landroidx/core/app/l$f;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->k()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Landroidx/core/app/k$a;->h()Ljava/lang/CharSequence;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Landroidx/core/app/k$a;->a()Landroid/app/PendingIntent;

    move-result-object v2

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/app/l$d;->e(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    .line 9
    :goto_2
    invoke-virtual {p1}, Landroidx/core/app/k$a;->e()[Landroidx/core/app/p;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p1}, Landroidx/core/app/k$a;->e()[Landroidx/core/app/p;

    move-result-object v1

    .line 11
    invoke-static {v1}, Landroidx/core/app/p;->b([Landroidx/core/app/p;)[Landroid/app/RemoteInput;

    move-result-object v1

    array-length v2, v1

    :goto_3
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 12
    invoke-static {v0, v4}, Landroidx/core/app/l$d;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 13
    :cond_3
    invoke-virtual {p1}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 14
    new-instance v1, Landroid/os/Bundle;

    invoke-virtual {p1}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_4

    .line 15
    :cond_4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    :goto_4
    invoke-virtual {p1}, Landroidx/core/app/k$a;->b()Z

    move-result v2

    const-string v3, "android.support.allowGeneratedReplies"

    .line 17
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_5

    .line 19
    invoke-virtual {p1}, Landroidx/core/app/k$a;->b()Z

    move-result v3

    .line 20
    invoke-static {v0, v3}, Landroidx/core/app/l$g;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 21
    :cond_5
    invoke-virtual {p1}, Landroidx/core/app/k$a;->f()I

    move-result v3

    const-string v4, "android.support.action.semanticAction"

    .line 22
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_6

    .line 23
    invoke-virtual {p1}, Landroidx/core/app/k$a;->f()I

    move-result v3

    invoke-static {v0, v3}, Landroidx/core/app/l$i;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_6
    const/16 v3, 0x1d

    if-lt v2, v3, :cond_7

    .line 24
    invoke-virtual {p1}, Landroidx/core/app/k$a;->j()Z

    move-result v3

    invoke-static {v0, v3}, Landroidx/core/app/l$j;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_7
    const/16 v3, 0x1f

    if-lt v2, v3, :cond_8

    .line 25
    invoke-virtual {p1}, Landroidx/core/app/k$a;->i()Z

    move-result v2

    .line 26
    invoke-static {v0, v2}, Landroidx/core/app/l$k;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 27
    :cond_8
    invoke-virtual {p1}, Landroidx/core/app/k$a;->g()Z

    move-result p1

    const-string v2, "android.support.action.showsUserInterface"

    .line 28
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    invoke-static {v0, v1}, Landroidx/core/app/l$d;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 30
    iget-object p1, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Landroidx/core/app/l$d;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/core/app/l$d;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    return-void
.end method

.method private static e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 1
    :cond_1
    new-instance v0, Lh0/b;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Lh0/b;-><init>(I)V

    .line 2
    invoke-virtual {v0, p0}, Lh0/b;->addAll(Ljava/util/Collection;)Z

    .line 3
    invoke-virtual {v0, p1}, Lh0/b;->addAll(Ljava/util/Collection;)Z

    .line 4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method private static g(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/core/app/o;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/app/o;

    .line 3
    invoke-virtual {v1}, Landroidx/core/app/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private h(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 2
    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 3
    iget v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x2

    and-int/lit8 v0, v0, -0x3

    .line 4
    iput v0, p1, Landroid/app/Notification;->defaults:I

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public c()Landroid/app/Notification;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->p:Landroidx/core/app/k$g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Landroidx/core/app/k$g;->b(Landroidx/core/app/j;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p0}, Landroidx/core/app/k$g;->e(Landroidx/core/app/j;)Landroid/widget/RemoteViews;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Landroidx/core/app/l;->d()Landroid/app/Notification;

    move-result-object v2

    if-eqz v1, :cond_2

    .line 5
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    goto :goto_1

    .line 6
    :cond_2
    iget-object v1, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    iget-object v1, v1, Landroidx/core/app/k$e;->H:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_3

    .line 7
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 8
    invoke-virtual {v0, p0}, Landroidx/core/app/k$g;->d(Landroidx/core/app/j;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 9
    iput-object v1, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_4
    if-eqz v0, :cond_5

    .line 10
    iget-object v1, p0, Landroidx/core/app/l;->c:Landroidx/core/app/k$e;

    iget-object v1, v1, Landroidx/core/app/k$e;->p:Landroidx/core/app/k$g;

    .line 11
    invoke-virtual {v1, p0}, Landroidx/core/app/k$g;->f(Landroidx/core/app/j;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 12
    iput-object v1, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    :cond_5
    if-eqz v0, :cond_6

    .line 13
    invoke-static {v2}, Landroidx/core/app/k;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 14
    invoke-virtual {v0, v1}, Landroidx/core/app/k$g;->a(Landroid/os/Bundle;)V

    :cond_6
    return-object v2
.end method

.method protected d()Landroid/app/Notification;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Landroidx/core/app/l$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v1, 0x18

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-lt v0, v1, :cond_3

    .line 3
    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Landroidx/core/app/l$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    .line 4
    iget v1, p0, Landroidx/core/app/l;->h:I

    if-eqz v1, :cond_2

    .line 5
    invoke-static {v0}, Landroidx/core/app/l$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/core/app/l;->h:I

    if-ne v1, v3, :cond_1

    .line 6
    invoke-direct {p0, v0}, Landroidx/core/app/l;->h(Landroid/app/Notification;)V

    .line 7
    :cond_1
    invoke-static {v0}, Landroidx/core/app/l$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_2

    iget v1, p0, Landroidx/core/app/l;->h:I

    if-ne v1, v2, :cond_2

    .line 8
    invoke-direct {p0, v0}, Landroidx/core/app/l;->h(Landroid/app/Notification;)V

    :cond_2
    return-object v0

    .line 9
    :cond_3
    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Landroidx/core/app/l;->g:Landroid/os/Bundle;

    invoke-static {v0, v1}, Landroidx/core/app/l$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 10
    iget-object v0, p0, Landroidx/core/app/l;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Landroidx/core/app/l$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    .line 11
    iget-object v1, p0, Landroidx/core/app/l;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_4

    .line 12
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 13
    :cond_4
    iget-object v1, p0, Landroidx/core/app/l;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_5

    .line 14
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 15
    :cond_5
    iget-object v1, p0, Landroidx/core/app/l;->i:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_6

    .line 16
    iput-object v1, v0, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 17
    :cond_6
    iget v1, p0, Landroidx/core/app/l;->h:I

    if-eqz v1, :cond_8

    .line 18
    invoke-static {v0}, Landroidx/core/app/l$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_7

    iget v1, p0, Landroidx/core/app/l;->h:I

    if-ne v1, v3, :cond_7

    .line 19
    invoke-direct {p0, v0}, Landroidx/core/app/l;->h(Landroid/app/Notification;)V

    .line 20
    :cond_7
    invoke-static {v0}, Landroidx/core/app/l$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_8

    iget v1, p0, Landroidx/core/app/l;->h:I

    if-ne v1, v2, :cond_8

    .line 21
    invoke-direct {p0, v0}, Landroidx/core/app/l;->h(Landroid/app/Notification;)V

    :cond_8
    return-object v0
.end method

.method f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l;->a:Landroid/content/Context;

    return-object v0
.end method
