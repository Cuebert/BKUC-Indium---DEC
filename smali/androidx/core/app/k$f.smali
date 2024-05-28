.class public Landroidx/core/app/k$f;
.super Landroidx/core/app/k$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/k$f$g;,
        Landroidx/core/app/k$f$e;,
        Landroidx/core/app/k$f$a;,
        Landroidx/core/app/k$f$d;,
        Landroidx/core/app/k$f$f;,
        Landroidx/core/app/k$f$c;,
        Landroidx/core/app/k$f$b;
    }
.end annotation


# instance fields
.field private e:I

.field private f:Landroidx/core/app/o;

.field private g:Landroid/app/PendingIntent;

.field private h:Landroid/app/PendingIntent;

.field private i:Landroid/app/PendingIntent;

.field private j:Z

.field private k:Ljava/lang/Integer;

.field private l:Ljava/lang/Integer;

.field private m:Landroidx/core/graphics/drawable/IconCompat;

.field private n:Ljava/lang/CharSequence;


# direct methods
.method private constructor <init>(ILandroidx/core/app/o;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/core/app/k$g;-><init>()V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroidx/core/app/o;->c()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iput p1, p0, Landroidx/core/app/k$f;->e:I

    .line 4
    iput-object p2, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    .line 5
    iput-object p5, p0, Landroidx/core/app/k$f;->g:Landroid/app/PendingIntent;

    .line 6
    iput-object p4, p0, Landroidx/core/app/k$f;->h:Landroid/app/PendingIntent;

    .line 7
    iput-object p3, p0, Landroidx/core/app/k$f;->i:Landroid/app/PendingIntent;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "person must have a non-empty a name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static h(Landroidx/core/app/o;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroidx/core/app/k$f;
    .locals 7

    .line 1
    new-instance v6, Landroidx/core/app/k$f;

    const-string v0, "declineIntent is required"

    .line 2
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/app/PendingIntent;

    const-string v0, "answerIntent is required"

    .line 3
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Landroid/app/PendingIntent;

    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v0, v6

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/core/app/k$f;-><init>(ILandroidx/core/app/o;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v6
.end method

.method public static i(Landroidx/core/app/o;Landroid/app/PendingIntent;)Landroidx/core/app/k$f;
    .locals 7

    .line 1
    new-instance v6, Landroidx/core/app/k$f;

    const-string v0, "hangUpIntent is required"

    .line 2
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/app/PendingIntent;

    const/4 v1, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Landroidx/core/app/k$f;-><init>(ILandroidx/core/app/o;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v6
.end method

.method private static j(Landroidx/core/app/k$a;)Landroid/app/Notification$Action;
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/core/app/k$a;->d()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->s()Landroid/graphics/drawable/Icon;

    move-result-object v2

    :goto_0
    invoke-virtual {p0}, Landroidx/core/app/k$a;->h()Ljava/lang/CharSequence;

    move-result-object v3

    .line 4
    invoke-virtual {p0}, Landroidx/core/app/k$a;->a()Landroid/app/PendingIntent;

    move-result-object v4

    .line 5
    invoke-static {v2, v3, v4}, Landroidx/core/app/k$f$d;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v2

    goto :goto_2

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroidx/core/app/k$a;->d()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->m()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    .line 8
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->k()I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 9
    :goto_1
    invoke-virtual {p0}, Landroidx/core/app/k$a;->h()Ljava/lang/CharSequence;

    move-result-object v3

    .line 10
    invoke-virtual {p0}, Landroidx/core/app/k$a;->a()Landroid/app/PendingIntent;

    move-result-object v4

    .line 11
    invoke-static {v2, v3, v4}, Landroidx/core/app/k$f$b;->e(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v2

    .line 12
    :goto_2
    invoke-virtual {p0}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 13
    new-instance v3, Landroid/os/Bundle;

    invoke-virtual {p0}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_3

    .line 14
    :cond_3
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 15
    :goto_3
    invoke-virtual {p0}, Landroidx/core/app/k$a;->b()Z

    move-result v4

    const-string v5, "android.support.allowGeneratedReplies"

    .line 16
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/16 v4, 0x18

    if-lt v0, v4, :cond_4

    .line 17
    invoke-virtual {p0}, Landroidx/core/app/k$a;->b()Z

    move-result v4

    .line 18
    invoke-static {v2, v4}, Landroidx/core/app/k$f$e;->b(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_4
    const/16 v4, 0x1f

    if-lt v0, v4, :cond_5

    .line 19
    invoke-virtual {p0}, Landroidx/core/app/k$a;->i()Z

    move-result v0

    .line 20
    invoke-static {v2, v0}, Landroidx/core/app/k$f$g;->e(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 21
    :cond_5
    invoke-static {v2, v3}, Landroidx/core/app/k$f$b;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 22
    invoke-virtual {p0}, Landroidx/core/app/k$a;->e()[Landroidx/core/app/p;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 23
    invoke-static {p0}, Landroidx/core/app/p;->b([Landroidx/core/app/p;)[Landroid/app/RemoteInput;

    move-result-object p0

    .line 24
    array-length v0, p0

    :goto_4
    if-ge v1, v0, :cond_6

    aget-object v3, p0, v1

    .line 25
    invoke-static {v2, v3}, Landroidx/core/app/k$f$b;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 26
    :cond_6
    invoke-static {v2}, Landroidx/core/app/k$f$b;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object p0

    return-object p0
.end method

.method private l()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/core/app/k$f;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo0/f;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo0/f;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_2
    iget-object v0, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo0/f;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private m(Landroidx/core/app/k$a;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_action_priority"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private n(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Landroidx/core/app/k$a;
    .locals 2

    if-nez p3, :cond_0

    .line 1
    iget-object p3, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object p3, p3, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-static {p3, p4}, Landroidx/core/content/a;->c(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 2
    :cond_0
    new-instance p4, Landroid/text/SpannableStringBuilder;

    invoke-direct {p4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 3
    iget-object v0, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 p3, 0x0

    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const/16 v1, 0x12

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 5
    new-instance p2, Landroidx/core/app/k$a$a;

    iget-object p3, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object p3, p3, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    .line 6
    invoke-static {p3, p1}, Landroidx/core/graphics/drawable/IconCompat;->h(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    invoke-direct {p2, p1, p4, p5}, Landroidx/core/app/k$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 7
    invoke-virtual {p2}, Landroidx/core/app/k$a$a;->b()Landroidx/core/app/k$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroidx/core/app/k$a;->c()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x1

    const-string p4, "key_action_priority"

    invoke-virtual {p2, p4, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p1
.end method

.method private o()Landroidx/core/app/k$a;
    .locals 8

    .line 1
    sget v0, Lo0/d;->b:I

    .line 2
    sget v1, Lo0/d;->a:I

    .line 3
    iget-object v7, p0, Landroidx/core/app/k$f;->g:Landroid/app/PendingIntent;

    if-nez v7, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    .line 4
    :cond_0
    iget-boolean v2, p0, Landroidx/core/app/k$f;->j:Z

    if-eqz v2, :cond_1

    move v3, v0

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    if-eqz v2, :cond_2

    .line 5
    sget v0, Lo0/f;->b:I

    goto :goto_1

    .line 6
    :cond_2
    sget v0, Lo0/f;->a:I

    :goto_1
    move v4, v0

    iget-object v5, p0, Landroidx/core/app/k$f;->k:Ljava/lang/Integer;

    sget v6, Lo0/b;->a:I

    move-object v2, p0

    .line 7
    invoke-direct/range {v2 .. v7}, Landroidx/core/app/k$f;->n(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Landroidx/core/app/k$a;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private p()Landroidx/core/app/k$a;
    .locals 6

    .line 1
    sget v1, Lo0/d;->c:I

    .line 2
    iget-object v5, p0, Landroidx/core/app/k$f;->h:Landroid/app/PendingIntent;

    if-nez v5, :cond_0

    .line 3
    sget v2, Lo0/f;->d:I

    iget-object v3, p0, Landroidx/core/app/k$f;->l:Ljava/lang/Integer;

    sget v4, Lo0/b;->b:I

    iget-object v5, p0, Landroidx/core/app/k$f;->i:Landroid/app/PendingIntent;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/core/app/k$f;->n(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Landroidx/core/app/k$a;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    sget v2, Lo0/f;->c:I

    iget-object v3, p0, Landroidx/core/app/k$f;->l:Ljava/lang/Integer;

    sget v4, Lo0/b;->b:I

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/core/app/k$f;->n(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Landroidx/core/app/k$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/core/app/k$g;->a(Landroid/os/Bundle;)V

    .line 2
    iget v0, p0, Landroidx/core/app/k$f;->e:I

    const-string v1, "android.callType"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-boolean v0, p0, Landroidx/core/app/k$f;->j:Z

    const-string v1, "android.callIsVideo"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 4
    iget-object v0, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    if-eqz v0, :cond_1

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    .line 6
    invoke-virtual {v0}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v0

    const-string v1, "android.callPerson"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroidx/core/app/o;->i()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.callPersonCompat"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/core/app/k$f;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_3

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_2

    .line 10
    iget-object v1, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v1, v1, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->t(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "android.verificationIcon"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->r()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.verificationIconCompat"

    .line 12
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    :cond_3
    :goto_1
    iget-object v0, p0, Landroidx/core/app/k$f;->n:Ljava/lang/CharSequence;

    const-string v1, "android.verificationText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Landroidx/core/app/k$f;->g:Landroid/app/PendingIntent;

    const-string v1, "android.answerIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    iget-object v0, p0, Landroidx/core/app/k$f;->h:Landroid/app/PendingIntent;

    const-string v1, "android.declineIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 16
    iget-object v0, p0, Landroidx/core/app/k$f;->i:Landroid/app/PendingIntent;

    const-string v1, "android.hangUpIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 17
    iget-object v0, p0, Landroidx/core/app/k$f;->k:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "android.answerColor"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 19
    :cond_4
    iget-object v0, p0, Landroidx/core/app/k$f;->l:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "android.declineColor"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public b(Landroidx/core/app/j;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_7

    .line 2
    iget v0, p0, Landroidx/core/app/k$f;->e:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const-string v0, "NotifCompat"

    .line 3
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized call type in CallStyle: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Landroidx/core/app/k$f;->e:I

    .line 5
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    invoke-virtual {v0}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Landroidx/core/app/k$f;->i:Landroid/app/PendingIntent;

    iget-object v2, p0, Landroidx/core/app/k$f;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Landroidx/core/app/k$f$g;->c(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    invoke-virtual {v0}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Landroidx/core/app/k$f;->i:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, Landroidx/core/app/k$f$g;->b(Landroid/app/Person;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    invoke-virtual {v0}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Landroidx/core/app/k$f;->h:Landroid/app/PendingIntent;

    iget-object v2, p0, Landroidx/core/app/k$f;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Landroidx/core/app/k$f$g;->a(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    :cond_3
    :goto_0
    if-eqz v1, :cond_10

    .line 10
    invoke-interface {p1}, Landroidx/core/app/j;->a()Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/k$f$e;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    .line 11
    invoke-interface {p1}, Landroidx/core/app/j;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {v1, p1}, Landroidx/core/app/k$f$a;->a(Landroid/app/Notification$CallStyle;Landroid/app/Notification$Builder;)V

    .line 12
    iget-object p1, p0, Landroidx/core/app/k$f;->k:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v1, p1}, Landroidx/core/app/k$f$g;->d(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    .line 14
    :cond_4
    iget-object p1, p0, Landroidx/core/app/k$f;->l:Ljava/lang/Integer;

    if-eqz p1, :cond_5

    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v1, p1}, Landroidx/core/app/k$f$g;->f(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    .line 16
    :cond_5
    iget-object p1, p0, Landroidx/core/app/k$f;->n:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroidx/core/app/k$f$g;->i(Landroid/app/Notification$CallStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$CallStyle;

    .line 17
    iget-object p1, p0, Landroidx/core/app/k$f;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz p1, :cond_6

    .line 18
    iget-object v0, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    .line 19
    invoke-virtual {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->t(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    .line 20
    invoke-static {v1, p1}, Landroidx/core/app/k$f$g;->h(Landroid/app/Notification$CallStyle;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$CallStyle;

    .line 21
    :cond_6
    iget-boolean p1, p0, Landroidx/core/app/k$f;->j:Z

    invoke-static {v1, p1}, Landroidx/core/app/k$f$g;->g(Landroid/app/Notification$CallStyle;Z)Landroid/app/Notification$CallStyle;

    goto/16 :goto_4

    .line 22
    :cond_7
    invoke-interface {p1}, Landroidx/core/app/j;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    .line 23
    iget-object v2, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroidx/core/app/o;->c()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_1

    :cond_8
    move-object v2, v1

    .line 24
    :goto_1
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 25
    iget-object v2, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v2, v2, Landroidx/core/app/k$e;->D:Landroid/os/Bundle;

    if-eqz v2, :cond_9

    const-string v3, "android.text"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 26
    iget-object v1, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v1, v1, Landroidx/core/app/k$e;->D:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    :cond_9
    if-nez v1, :cond_a

    .line 27
    invoke-direct {p0}, Landroidx/core/app/k$f;->l()Ljava/lang/String;

    move-result-object v1

    .line 28
    :cond_a
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 29
    iget-object v1, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    if-eqz v1, :cond_d

    const/16 v2, 0x17

    if-lt v0, v2, :cond_b

    .line 30
    invoke-virtual {v1}, Landroidx/core/app/o;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 31
    iget-object v1, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    .line 32
    invoke-virtual {v1}, Landroidx/core/app/o;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    iget-object v2, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v2, v2, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->t(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    .line 33
    invoke-static {p1, v1}, Landroidx/core/app/k$f$d;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V

    :cond_b
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_c

    .line 34
    iget-object v1, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    invoke-virtual {v1}, Landroidx/core/app/o;->h()Landroid/app/Person;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/app/k$f$f;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_2

    .line 35
    :cond_c
    iget-object v1, p0, Landroidx/core/app/k$f;->f:Landroidx/core/app/o;

    invoke-virtual {v1}, Landroidx/core/app/o;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/app/k$f$c;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 36
    :cond_d
    :goto_2
    invoke-virtual {p0}, Landroidx/core/app/k$f;->k()Ljava/util/ArrayList;

    move-result-object v1

    const/16 v2, 0x18

    if-lt v0, v2, :cond_e

    .line 37
    invoke-static {p1}, Landroidx/core/app/k$f$e;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    .line 38
    :cond_e
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/app/k$a;

    .line 39
    invoke-static {v1}, Landroidx/core/app/k$f;->j(Landroidx/core/app/k$a;)Landroid/app/Notification$Action;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/app/k$f$b;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    goto :goto_3

    :cond_f
    const-string v0, "call"

    .line 40
    invoke-static {p1, v0}, Landroidx/core/app/k$f$c;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_10
    :goto_4
    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$CallStyle"

    return-object v0
.end method

.method public k()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/k$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/core/app/k$f;->p()Landroidx/core/app/k$a;

    move-result-object v0

    .line 2
    invoke-direct {p0}, Landroidx/core/app/k$f;->o()Landroidx/core/app/k$a;

    move-result-object v1

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x2

    .line 5
    iget-object v3, p0, Landroidx/core/app/k$g;->a:Landroidx/core/app/k$e;

    iget-object v3, v3, Landroidx/core/app/k$e;->b:Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    .line 6
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/core/app/k$a;

    .line 7
    invoke-virtual {v5}, Landroidx/core/app/k$a;->j()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_1
    invoke-direct {p0, v5}, Landroidx/core/app/k$f;->m(Landroidx/core/app/k$a;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    if-le v0, v4, :cond_3

    .line 10
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    :cond_3
    :goto_1
    if-eqz v1, :cond_0

    if-ne v0, v4, :cond_0

    .line 11
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    if-lt v0, v4, :cond_5

    .line 12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v2
.end method

.method public q(I)Landroidx/core/app/k$f;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/k$f;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public r(I)Landroidx/core/app/k$f;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/k$f;->l:Ljava/lang/Integer;

    return-object p0
.end method
