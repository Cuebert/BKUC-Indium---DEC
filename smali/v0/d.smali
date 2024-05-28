.class public final Lv0/d;
.super Lv0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/d$a;
    }
.end annotation


# static fields
.field public static final s:Lv0/d$a;


# instance fields
.field private final r:Lu0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv0/d$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lv0/d;->s:Lv0/d$a;

    return-void
.end method

.method public constructor <init>(Lu0/e;Ljava/lang/CharSequence;)V
    .locals 2

    const-string v0, "domError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lu0/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-direct {p0, v0, p2}, Lv0/e;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 4
    iput-object p1, p0, Lv0/d;->r:Lu0/e;

    return-void
.end method

.method public synthetic constructor <init>(Lu0/e;Ljava/lang/CharSequence;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lv0/d;-><init>(Lu0/e;Ljava/lang/CharSequence;)V

    return-void
.end method
