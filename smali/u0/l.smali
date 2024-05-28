.class public final Lu0/l;
.super Lu0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/l$a;
    }
.end annotation


# static fields
.field public static final b:Lu0/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu0/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu0/l$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lu0/l;->b:Lu0/l$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_INVALID_STATE_ERROR"

    invoke-direct {p0, v0}, Lu0/e;-><init>(Ljava/lang/String;)V

    return-void
.end method
